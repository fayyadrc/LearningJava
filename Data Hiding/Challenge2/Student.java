class Student{

    private String name;
    private String rollNumber;

    public Student(){
        this.name = null;
        this.rollNumber = null;
    }

    public Student(String name, String rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;

    }

    public String getName(){
        return this.name;
    }

    public String getRollNumber(){
        return this.rollNumber;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setRollNumber(String rollNumber){
        this.rollNumber = rollNumber;
    }


}
