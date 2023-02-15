import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class HomePage extends JFrame implements ActionListener {

    private JFrame frame;
    private List<Book> books;
    private JTable bookList;
    private JScrollPane scrollPane;

    public HomePage() {
        // Initialize the JFrame
        frame = new JFrame("Library Home");
        frame.setSize(500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Use a GridBagLayout for the frame
        frame.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        // Initialize the list of books
        books = new ArrayList<>();

        // Initialize the add book button
        JButton addBookButton = new JButton("Add Book");
        c.gridx = 0;
        c.gridy = 0;
        frame.add(addBookButton, c);

        // Add an action listener to the add book button
        addBookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the book id, name, and price from the user
                String id = JOptionPane.showInputDialog(frame, "Enter the book id:");
                String name = JOptionPane.showInputDialog(frame, "Enter the book name:");
                String price = JOptionPane.showInputDialog(frame, "Enter the book price:");
                double bookPrice = 0;
                try {
                    bookPrice = Double.parseDouble(price);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid price format", "Error", JOptionPane.ERROR_MESSAGE);
                }
                // Create a new book with the given id, name, and price
                Book book = new Book(id, name, bookPrice);
                // Add the book to the list of books
                books.add(book);
                updateBookList();
            }
            private void updateBookList() {
                bookList.setSize(2, 2);
                bookList.setFont(new Font("Arial", Font.PLAIN, 14));
                String bookText = "Name\t\t\t\t\t\tID\t\t\t\t\t\tPrice\n"+"-------------------------------------------------------------------------------\n";
                for (Book book : books) {
                    bookText += book.getName() + "\t\t\t\t\t\t\t" + book.getId() + "\t\t\t\t\t\t\t" + book.getPrice() + "\n";
                }
                bookList.setToolTipText(bookText);
            }

        });
        JButton removeBookButton = new JButton("Remove Book");
        c.gridx = 1;
        c.gridy = 0;

        // Initialize the remove book button
        removeBookButton.setBounds(160, 280, 120, 25);
        frame.add(removeBookButton);

        // Add an action listener to the remove book button
        removeBookButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Get the id of the book to be removed from the user
                String id = JOptionPane.showInputDialog(frame, "Enter the id of the book to be removed:");
                // Iterate through the list of books to find the book with the given id
                for (Book book : books) {
                    if (book.getId().equals(id)) {
                        // Remove the book from the list of books
                        books.remove(book);
                        JOptionPane.showMessageDialog(frame, "Book removed successfully", "Success",
                                JOptionPane.INFORMATION_MESSAGE);
                        break;
                    }
                }
            }
        });

        JButton ShowBooksButton = new JButton("Show all book");
        ShowBooksButton.setBounds(290, 280, 120, 25);
        frame.add(ShowBooksButton);

        ShowBooksButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String s = "";
                for (Book book : books) {
                    s += " " + book + " ";
                }
                JLabel jl = new JLabel(s);
                jl.setBounds(40, 50, 400, 500);
                frame.add(jl);
            }
        });
        bookList = new JTable();
        bookList.setSize(400, 200);

        JScrollPane scrollPane = new JScrollPane(bookList);
        scrollPane.setBounds(40, 50, 400, 200);
        frame.add(scrollPane);

        repaint();
    }

    public static void main(String[] args) {
        HomePage hm = new HomePage();
    }   

    @Override
    public void actionPerformed(ActionEvent arg0) {
        // TODO Auto-generated method stub
        
    }

}

class Book {
    private String id;
    private String name;
    private double price;

    public Book(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
