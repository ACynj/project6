package 第九章一星题目;

public class QuadraticEquation {
private double a,b,c;

public double getA() {
	return a;
}

public double getB() {
	return b;
}

public double getC() {
	return c;
}
public QuadraticEquation(double a,double b,double c) {
	this.a=a;
	this.b=b;
	this.c=c;
}
public double getDiscriminant() {
	return b*b-4*a*c;
}
public double getRoot1() {
	double x=b*b-4*a*c;
	if(x<0)
	return 0;
	else {
		return (-b+x)/(2*a);
	}
	
	
}
public double getRoot2() {
	double x=b*b-4*a*c;
	if(x<0)
	return 0;
	else {
		return (-b-x)/(2*a);
	}
	
	
}
}
