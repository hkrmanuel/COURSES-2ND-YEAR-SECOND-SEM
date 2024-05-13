public class MyArrayList {
    private Object[] arraylist;
    private int size =0;

    public MyArrayList(){

    }

    public MyArrayList(int s){
        size = s;
        arraylist = new Object[size];
    }


    public void add(Object item){
        boolean add = false;

        for (int i =0; i < size; i++){
            if (arraylist[i] == null){
                arraylist[i]=item;
                add = true;
                break;
            }
            else{
                add =false;
            }
        }
        
        if (!add)  {
            resize();
            add(item);
        }

    }

    public Object  remove(int index){
        Object item =0;
        if (IsEmpty()){
            System.out.println("List Is Empty!!");
        }
        else{
            try{
                item = arraylist[index];
                arraylist[index] = null;
            }catch(IndexOutOfBoundsException e){
                System.out.println("Wrong Index!!!");
            }

        }
        return item;
    }

    public Object get(int index){
        Object item =0;
        if (IsEmpty()){
            System.out.println("List Is Empty!!");
        }

        else{
        try{
            item = arraylist[index];
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Wrong Index!!!");
        }
        }
        return item;
    }

    public int size(){
        return size;
    }

    public boolean IsEmpty(){
        boolean check = true;
        for (int s = 0; s < size; s++){
            if (arraylist[s] !=null){
                check = false;
                break;
            }
            else{
                check = true;
            }
        }
        return check;
    }

    public void display(){
        if (IsEmpty()){
            System.out.println("List Is Empty!!");  
        }
        else{
            for (int s=0; s < size; s++){
                if (arraylist[s]!= null){
                    System.out.println(arraylist[s]);
                }
            }
        }

    }

    public void set(int index, Object obj){
        try{
        if (arraylist[index] == null){
            arraylist[index] = obj;
        }

        else{
            remove(index);
            arraylist[index] = obj;
        }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Invalid Index!!!");
        }
    }
    //Resize the ArrayList
    public void resize(){
        size = size * 2;
        Object[] arraylist2 = new Object[size];
        
        for (int s =0; s < arraylist.length; s++){
            arraylist2[s]= arraylist[s];
        }
        arraylist =arraylist2;
    }

    

}
