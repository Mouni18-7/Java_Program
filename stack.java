
class stack {
private int arr[];
private int top;
private int top;
stack (int size){	
arr=new int[size];
capacity=size;
top=1;
}
public void push (int x){
if(isFull()){
System.out.println("stack overFlow");
system.exit(1);
}
public int pop(){
if (isEmpty()){
System.out.println ("Stack Empty");
System.exit(1);
}
return arr [top--];
}
public int getsize(){
return top+1;
}
public boolean isEmpty(){
return top==-1;
public boolean isFull(){
return top== capacity-1;
}
public void printstack(){
for(int i=0; i<=top; i++){
System.out.print(arr[i]+")");
}
}
public static void main (String[] args){
stack stack=new stack(5);
stack.push(1);
stack.push(2);
stack.push(3);
System.out.print("stack:");
stack.printstack();
stack.pop();
System.out.println("\n After popping out");
stack.printstack();
}
}