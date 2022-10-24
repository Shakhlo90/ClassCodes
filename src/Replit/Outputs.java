package Replit;

interface Outputs{
void display(double result);



}
interface  Functions extends Outputs{
    double labelAdd();
    double labelSub ();
    double labelMult();
    double labelDev();

}