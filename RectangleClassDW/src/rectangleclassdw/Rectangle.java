// Rectangle.java -- Exercise 8.4
// Displays area and perimeter based on input of length and width
// David Wu
// July 10, 2012

package rectangleclassdw;

public class Rectangle // start of class Rectangle
{
    public float lengthSize;

    public float widthSize;

    public Rectangle (float length, float width) // constructor
    {
        lengthSize = length;
        widthSize = width;
    }

    public void setLength(float length) // sets variable
    {
        lengthSize = length;
    }

    public float getLength () // gets variable
    {
        return lengthSize;
    }

    public void setWidth(float width) // set variable
    {
        width = widthSize;
    }

    public float getWidth () // get variable
    {
        return widthSize;
    }

}// end of class Rectangle