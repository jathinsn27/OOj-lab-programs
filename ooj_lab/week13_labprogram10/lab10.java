import java.awt.*;
import java.awt.event.*;

class SampleDialog extends Dialog implements ActionListener{
    IntDivision iobj;
    SampleDialog(Frame parent, String title){
        super(parent, title, false);
        iobj = (IntDivision)parent;
        setLayout(new FlowLayout());
        setSize(100,50);
        add(new Label(iobj.msg));
        Button b;
        add(b = new Button("OK"));
        b.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        dispose();
    }
}

class IntDivision extends Frame implements ActionListener{
    Button calculate;
    TextField int1;
    TextField int2;
    double result;
    int a,b;
    String msg= "Enter The Two Numbers";
    Dialog SampleDialog;
    public IntDivision(){

        setLayout(new FlowLayout());

        calculate = new Button("calculate");
        int1 = new TextField(10);
        Label n1 = new Label("Number1", Label.RIGHT);
        int2 = new TextField(10);
        Label n2 = new Label("Number2", Label.RIGHT);
        
        add(n1);
        add(int1);
        add(n2);
        add(int2);
        add(calculate);
        int1.addActionListener(this);
        int2.addActionListener(this);
        calculate.addActionListener(this);
        addWindowListener(new MyWindowAdapter());
    }

    public void actionPerformed(ActionEvent ae){
        try{
            result = onDivision();
            msg = ("The final result is: " +result);
            repaint();
        }
        catch(NumberFormatException e){
            msg = ("The number is not an integer " +e);
            repaint();
        }
        catch(ArithmeticException e){
            msg = ("The integer cannot be divided by zero " +e);
            SampleDialog dia = new SampleDialog(this, "Dialog");
            dia.setSize(new Dimension(600,300));
            dia.setVisible(true);
        }
    }
        
    public double onDivision(){
        a = Integer.parseInt(int1.getText());
        b = Integer.parseInt(int2.getText());
        if(b==0){
            throw new ArithmeticException();
        }
        return (double)a/b;
    }

    public void paint(Graphics g){
        g.drawString(msg, 200, 200);
    }

    public static void main(String args[]){
        IntDivision d = new IntDivision();
        d.setSize(new Dimension(500, 500));
        d.setTitle("Integer Division");
        d.setVisible(true);
    }
}

class MyWindowAdapter extends WindowAdapter{
    public void windowClosing(WindowEvent event){
        System.exit(0);
    }
}