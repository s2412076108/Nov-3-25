class Class1{
  int x =10;
  int y = 5;
  int z;
  
  Class1 (int x){
    this.x =x;// w/o this x=200, x=200
  }
  
  void print(){
    z = z +x;
    System.out.println("z: " +z);
  }
}

class This{
  public static void main(String args[]){
  Class1 c = new Class1(200);
  c.print();
  }
}
