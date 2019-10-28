package HomeworkGenerics;

public class Box <String, Integer> {
    private String text;
    private Integer number;

    Box(String text1, Integer number1){
        text = text1;
        number = number1;
    }
    public String getText(){
        return text;
    }
    public Integer getNumber(){
        return  number;
    }
    public void setText(String text2) {
        this.text = text2;
    }
    public void setNumber(Integer number2) {
        this.number = number2;
    }
    public void deleteText() {
        this.text = null;
    }
    public void deleteNumber() {
        this.number = null;
    }

}




