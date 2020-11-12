public class CircularQueue{
  private int[] container;
  private int front;
  private int back;
  private int currentSize;

  public CircularQueue(int size){
    container = new int[size];
    front =0;
    back = 0;
    currentSize = 0;
  }

  public void enqueue(int val){
    //queue is full
    if(isFull()){
      System.out.println("No space!");
    }
    else if(isEmpty()){
      container[front] = val;
      currentSize = 1;
    }
    else{
      back = (back+1)%container.length;
      container[back] = val;
      currentSize ++;
    }

    System.out.println("Front: " + front);
    System.out.println("back: " + back);
  }

  public void dequeue(){

    int temp = 0;

    if(isEmpty()){
      System.out.println("Queue is empty");
    }else {
      temp = container[front];
      container[front] = 0;
      front = (front + 1)%container.length;
      currentSize --;
    }
    //queue is empty
    System.out.println("Front: " + front);
    System.out.println("back: " + back);

    System.out.println("Value deleted: " + temp);
  }


  public boolean isFull(){
    if(currentSize == container.length){
      return true;
    }else {
      return false;
    }
  }

  public boolean isEmpty(){
    if(currentSize == 0){
      return true;
    }else {
      return false;
    }

  }

  public int getFront(){
    return front;
  }

}
