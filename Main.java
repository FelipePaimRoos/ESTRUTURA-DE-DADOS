public class Main
{
	    double X, Y;
	    
	    public void main(double X, double Y){
	        this.X = X;
	        this.Y = Y;
	    }
	    
	    public double getX(){
	        return X;
	    }
	    
	    public double getY(){
	        return Y;
	    }
	    
	    public void setX(double X){
	        this.X = X;
	    }
	    
	    public void setY(double Y){
	        this.Y = Y;
	    }
	    
	    public double calcularXY(double X, double X1, double Y, double Y1){
	        double resultado = Math.sqrt(Math.pow(X1 - X, 2) + Math.pow(Y1 - Y, 2));
	        System.out.println(resultado);
	        return resultado;
	    }
	    
	     public static void main (String[] args) {
            
            Main teste = new Main();
            
            teste.calcularXY(40,15,8,10);
            
        }
}
