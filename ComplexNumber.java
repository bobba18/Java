package learn.java;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real +=real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber number) {
        double realPart = number.getReal();
        double imaginaryPart = number.getImaginary();
        this.real += realPart;
        this.imaginary += imaginaryPart;
    }

    public void subtract(double real, double imaginary) {
        this.real -=real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber number) {
        double realPart = number.getReal();
        double imaginaryPart = number.getImaginary();
        this.real -= realPart;
        this.imaginary -= imaginaryPart;
    }
}
