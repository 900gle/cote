package step1;

public class ArrayListDoo {

    private int size = 0;
    private Object[] elementData = new Object[5];


    public void resize(){


        if (elementData.length == size){
            Object[] newArray = new Object[size + 2];
            for (int i = 0; i < size; i++){
                newArray[i] = elementData[i];
            }
            elementData = newArray;
        }
    }

    public boolean addLast (Object e){
        resize();
        elementData[size] = e;
        size++;
        return true;
    }
    public boolean addFirst(Object element){
//        resize();
        return add(0, element);
    }
    public boolean add (int index, Object element){
        resize();
        for(int i = size -1; i >= index; i--){
            elementData[i+1] = elementData[i];
        }
        elementData[index] = element;
        size++;
        return true;
    }


    public Object get(int index){
        return elementData[index];
    }

    public int size(){
        return size;
    }

    public int indexOf(Object element){
        for (int i = 0; i < size; i++){
            if(elementData[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public String toString(){
        String str = "[";
        for(int i=0; i <size; i++){
            str += elementData[i];
            if (i < size-1){
                str +=",";
            }
        }
        return str + "]";
    }
}
