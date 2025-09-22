public class Array{
    public static void update(int array[]){
        for(int i=0;i<array.length;i++) {
            array[i]=array[i]+1;
        }
    }
    public static void main(String args[]){
        int marks[]=new int[3];
        marks[0]=97;// Phy marks
        marks[1]=98;// Chem marks
        marks[2]=99;// MAth marks

        
        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }

    

        update(marks);

        for(int i=0;i<marks.length;i++) {
            System.out.println(marks[i]);
        }

    

    }
}