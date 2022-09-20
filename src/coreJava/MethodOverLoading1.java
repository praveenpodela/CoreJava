package coreJava;

class area
{
	float pi = 3.14f;
	public void areaofshape(int dim1,String shape)
	{
		if (shape.equalsIgnoreCase("circle"))
		{
			System.out.println("area of circle ="+(3.14*dim1*dim1));
		}
	}
	public void areaofshape(int dim1,int dim2,String shape)
	{
		if (shape.equalsIgnoreCase("triangle"))
		{
		System.out.println("artea of triangle"+(0.5*dim1*dim2));	
	}
		else if (shape.equalsIgnoreCase("rectangle"))	
		{
			System.out.println("area of rectangle"+(dim1*dim2));
		}
		
		
		
	}
	
	public void areaofshape(int dim1 ,int dim2,int dim3, String shape)
	{
		System.out.println("area of cube= "+ (dim1+dim2*dim3));
	}
}


public class MethodOverLoading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		area obj = new area ();
		{
			obj	.areaofshape(5,"circle");
			obj.areaofshape(10,10,10,"cube");
			obj.areaofshape(2,4,"rec");
			obj.areaofshape(3,2,"triangle");
		}
	
		
	}

}
