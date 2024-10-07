package de.telran.lesson_7_01okt_AmortisirovanAnalis;

public class DynamicArray {

        public int[] array; // variable array[] is an array
        private int count; // количесвто элементов в списке
        private int size; // размер массива
        private int k; // коэфициент увеличения массива

        public DynamicArray() {
            array = new int[1];
            count = 0;
            size = 1;
            k = 2;
        }

    //******************ДЗ_7_ 01 окт*********************************
    //Реализуйте методы:
    //set(index, data) - изменяет элемент
    public void set(int index,int data){
           this.array[index] =data;
    }

    //clean() - удаляет все элементы
    public void clean(){
            for (int i=0; i<this.size;i++){
                this.array[i]=0;
            }
            this.count=0;
    }

    //contains(data) - проверяет существует ли элемент ( ищет первое совпадение)
    public boolean contains(int data){
            boolean resalt=false;
        for (int i=0; i<this.size;i++){
            if(this.array[i]==data) resalt= true;
        }
        return resalt;
    }

    //isEmpty() - вернет false, если в структуре есть элемент

    public boolean isEmpty(){
        boolean resalt=true;
        for (int i=0; i<this.size;i++){
            if(this.array[i]!=0) resalt= false;
        }
        return resalt;
    }

    //************ End of hw ***********************

    // добавляем элементы в конец
    public void add (int data) {
        if(this.count == this.size) {
            growSize();
        }

        this.array[this.count] = data;
        this.count++;
    }

    // расширяем внутренний массив
    private void growSize() {
        int[] temp = new int[this.size * this.k];
        for(int i=0; i<this.size; i++) {
            temp[i] = this.array[i];
        }
        this.array = temp;
        this.size = this.size * this.k;
    }

    // добавление по индексу
    public void addAt(int index, int data) {
        //расширяем массив
        if (this.count == this.size) {
            this.growSize();
        }

        // смещаем на единицу вправо, освобождая место по index
        for (int i = this.count - 1; i >= index; i--) {
            this.array[i + 1] = this.array[i];
        }
        //вставляем элемент
        this.array[index] = data;
        this.count++;
    }

    //удаляем последний элемент
    public void remove() {
        if (this.count > 0) {
            this.array[this.count - 1] = 0;
            this.count--;
        }
    }

    //удаление по индексу
    public void removeAt(int index) {
        if (this.count > 0) {
            for (int i = index; i < this.count - 1; i++) {
                this.array[i] = this.array[i + 1];
            }
            this.array[this.count - 1] = 0;
            this.count--;
        }
    }




    }

