import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class maHonePage extends JFrame implements ActionListener {
    JButton searchButton, updateButton, addButton;
    JTable table;
    DefaultTableModel model;
    private JLabel addLabel;
    private JLabel deleteLabel;
    private JLabel updateLabel;
    private JLabel listLabel;
    JButton deleteButton;

    maHonePage() {

        setTitle("Book Table");
        setSize(800, 500);
        setVisible(true);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // colorUI();
        repaint();

        // Create the table
        String[] columnNames = { "Title", "Author", "ISBN" };
        Object[][] data = { { "Title1", "Author1", "ISBN1" }, { "Title2", "Author2", "ISBN2" },
                { "Title3", "Author3", "ISBN3" } };
        table = new JTable(data, columnNames);
        JScrollPane scrollPane = new JScrollPane(table);

        model = new DefaultTableModel(columnNames, 0);
        for (Object[] row : data) {
            model.addRow(row);
        }
        table.setOpaque(false);
        scrollPane.setOpaque(false);
        table.setBackground(backgroundColor);
        table.setForeground(new Color(55,255,55));
        scrollPane.setBackground(new Color(150,150,150));

        // Create the buttons
        addButton = new JButton("Add");
        deleteButton = new JButton("Delete");
        updateButton = new JButton("Update");
        searchButton = new JButton("Search");

        addButton.addActionListener(this);
        deleteButton.addActionListener(this);
        updateButton.addActionListener(this);
        searchButton.addActionListener(this);

        // Create the labels
        addLabel = new JLabel("Add a new book to the table");
        deleteLabel = new JLabel("Delete a book from the table");
        updateLabel = new JLabel("Update a book in the table");
        listLabel = new JLabel("search all books in the table");

        // Add the buttons and labels to a panel
        JPanel buttonPanel = new JPanel();
        buttonPanel.add(addButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(updateButton);
        buttonPanel.add(searchButton);
        buttonPanel.add(addLabel);
        buttonPanel.add(deleteLabel);
        buttonPanel.add(updateLabel);
        buttonPanel.add(listLabel);

        // Add the table and button panel to the frame
        add(buttonPanel, BorderLayout.SOUTH);
        add(scrollPane, BorderLayout.CENTER);
        pack();
        repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (table.getModel() != model) {
            table.setModel(model);
        }
        if (e.getSource() == addButton) {
            // Code to add a new book to the table
            // For example, open a dialog box to collect information from the user
            String title = JOptionPane.showInputDialog("Enter the title of the book:");
            String author = JOptionPane.showInputDialog("Enter the author of the book:");
            String ISBN = JOptionPane.showInputDialog("Enter the ISBN of the book:");
            model.addRow(new Object[] { title, author, ISBN });
            // SwingUtilities.invokeLater(() -> updateTable());

        } else if (e.getSource() == deleteButton) {
            // code to delete a book from the table
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                model.removeRow(selectedRow);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            }
        } else if (e.getSource() == updateButton) {
            // code to update a book in the table
            int selectedRow = table.getSelectedRow();
            if (selectedRow != -1) {
                String title = JOptionPane.showInputDialog("Enter the new title of the book:");
                String author = JOptionPane.showInputDialog("Enter the new author of the book:");
                String ISBN = JOptionPane.showInputDialog("Enter the new ISBN of the book:");
                model.setValueAt(title, selectedRow, 0);
                model.setValueAt(author, selectedRow, 1);
                model.setValueAt(ISBN, selectedRow, 2);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to update.");
            }
        } else if (e.getSource() == searchButton) {
            String searchTerm = JOptionPane.showInputDialog("Enter the ISBN of the book to search for:");
            boolean found = false;
            for (int i = 0; i < model.getRowCount(); i++) {
                if (!model.getValueAt(i, 2).toString().equals(searchTerm)) {
                    model.removeRow(i);
                    i--;
                } else {
                    found = true;
                }
            }
            if (!found) {
                JOptionPane.showMessageDialog(this, "No book found with the given ISBN.");
            }
        }
        deleteButton.setBackground(buttonColor);
        deleteButton.setForeground(textColor);
        updateButton.setBackground(buttonColor);
        updateButton.setForeground(textColor);
        searchButton.setBackground(buttonColor);
        searchButton.setForeground(textColor);
        addButton.setBackground(buttonColor);
        addButton.setForeground(textColor);
        updateLabel.setForeground(new Color(0,0,0));
        listLabel.setForeground(new Color(0,0,0));
        repaint();

    }

     final Color backgroundColor = new Color(75, 75, 75);
     final Color textColor = new Color(55, 255, 55);
     final Color buttonColor = new Color(50, 50, 50);

    private void colorUI() {

        getContentPane().setBackground(backgroundColor);
        addLabel.setForeground(textColor);
        deleteLabel.setForeground(textColor);
       
       
    }

    public static void main(String[] args) {
        new maHonePage();
    }

}

class Book {
    String Title;
    String Author;
    String ISBN;
    public static ArrayList<Book> bookList = new ArrayList<>();

    public Book(String Title, String Author, String ISBN) {
        this.Title = Title;
        this.Author = Author;
        this.ISBN = ISBN;
    }

    /**
     * @return the iSBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @return the author
     */
    public String getAuthor() {
        return Author;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return Title;
    }
    // private void updateTable() {
    // model.setRowCount(0);
    // for (Book b : Book.bookList) {
    // model.addRow(new Object[] { b.getTitle(), b.getAuthor(), b.getISBN() });
    // }
    // table.repaint();
    // table.revalidate();
    // }

}