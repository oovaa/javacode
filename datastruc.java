class datastruc {
    public static void main(String[] args) {
dynamicArray dr =new dynamicArray();

dr.add("a");
dr.add("b");
dr.add("c");
dr.insert(2, "er");

// System.out.println(dr.isEmoty());
dr.delet("c");
System.out.println(dr.search("er"));
System.out.println(dr.capacity);
    }
}



class dynamicArray{
   int size;
  int capacity =10;
    Object[] array;


dynamicArray(){
    this.array = new Object[capacity];

}
dynamicArray(int capacity){
this.capacity = capacity;
this.array = new Object[capacity];
}

void add(Object data){

    if (size >= capacity) {
        grow();
    }
 array[size] = data;   
size++;
}

void insert(int index, Object data){
if(size>=capacity){
    grow();
}
for (int i = size; i > index; i--) {
    array[i] = array[i-1]; 
}
array[index] = data;
size++;

}
void delet(Object data){
for (int i = 0; i < size;i++) {
    if (array[i] == data) {
        for (int j = 0; j < (size-1-i); j++) {
            array[i+j] = array[j+i+1];
        }
        array[size-1] = null;
        size--;
        if(size <= (int)(capacity/3)) shrink();
        break; 
    }
   
}

}
void delet(int index){


}
int search(Object data){
for (int i = 0; i < size; i++) {
    if (array[i] == data) {
        return i;
    }
}
    return -1;
}

private void grow(){

    int newcapacity =(int)capacity*2;
 Object[] newArray = new Object[newcapacity];
 for (int i = 0; i < size; i++) {
    newArray[i] = array[i];
 }
  capacity = newcapacity;
  array = newArray;
}

private void shrink(){

}

boolean isEmoty(){
    return size ==0;
}

public String toString(){

String s = "";

for (int i = 0; i < capacity; i++) {
     s+=array[i]+", ";
}
if (s!="") {
    s = "["+s.substring(0,s.length()-2)+"]";
}
else return "[]";
    return s;
}
}