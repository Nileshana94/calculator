import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

public class MainFormController {
    public TextField txtInput;
    private double numOne=0;
    private double numtwo=0;
    private char exep='+';

    public void numOneOnAction(MouseEvent mouseEvent) {
        setNumber(1);
    }

    public void numTwoOnAction(MouseEvent mouseEvent) {
        setNumber(2);
    }

    public void numThreeOnAction(MouseEvent mouseEvent) {
        setNumber(3);
    }

    public void numFourOnAction(MouseEvent mouseEvent) {
        setNumber(4);
    }

    public void numFiveOnAction(MouseEvent mouseEvent) {
        setNumber(5);
    }

    public void numSixOnAction(MouseEvent mouseEvent) {
        setNumber(6);
    }

    public void numSevenOnAction(MouseEvent mouseEvent) {
        setNumber(7);
    }

    public void numEightOnAction(MouseEvent mouseEvent) {
        setNumber(8);
    }

    public void numNineOnAction(MouseEvent mouseEvent) {
        setNumber(9);
    }

    public void ClearOnAction(MouseEvent mouseEvent) {
    }

    public void NumZeroOnAction(MouseEvent mouseEvent) {

        setNumber(0);
    }

    public void devOnAction(MouseEvent mouseEvent) {
        exec('/');
    }

    public void plusOnAction(MouseEvent mouseEvent) {
        exec('+');
    }

    public void minusOnAction(MouseEvent mouseEvent) {
        exec('-');
    }

    public void multiplyOnAction(MouseEvent mouseEvent) {
        exec('*');
    }

    public void equalOnAction(MouseEvent mouseEvent) {
    }

    private void setNumber(int number){
        if(txtInput.getText().isEmpty() || Integer.parseInt(txtInput.getText())==0){
            txtInput.setText(String.valueOf(number));
            return;
        }
        else{
        txtInput.setText(txtInput.getText()+number);}
    }

    private void exec(char exep){
        this.exep=exep;
         if(numOne==0){
             numOne =Double.parseDouble(txtInput.getText());
             txtInput.clear();
         }
         else{
             numtwo =Double.parseDouble(txtInput.getText());
             calculate();
         }

    }

    private void calculate(){
        double answer=0.0;
        switch(exep){
            case '+': answer=numOne+numtwo;
            break;

            case '*': answer=numOne*numtwo;
            break;

            case '-': answer=numOne-numtwo;
            break;

            case '/': answer=numOne/numtwo;
            break;

        }

        txtInput.setText(String.valueOf(answer));
        numOne=0;
        numtwo=0;
    }
}
