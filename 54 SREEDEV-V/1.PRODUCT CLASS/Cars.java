{\rtf1\ansi\ansicpg1252\cocoartf1348\cocoasubrtf170
{\fonttbl\f0\fswiss\fcharset0 Helvetica;}
{\colortbl;\red255\green255\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\pard\tx566\tx1133\tx1700\tx2267\tx2834\tx3401\tx3968\tx4535\tx5102\tx5669\tx6236\tx6803\pardirnatural

\f0\fs24 \cf0 package product;\
\
public class Cars \{\
\
	public static void main(String[] args) \{\
		Product p1 = new Product();\
		p1.pcode = "Cars123" ;\
		p1.pname = "Benz" ;\
		p1.price= 350000;\
		System.out.println("Displaying p1	:");\
		p1.display();\
		\
		Product p2 = new Product();\
		p2.pcode = "Cars1234" ;\
		p2.pname = "BMW" ;\
		p2.price= 400000;\
		System.out.println("Displaying p2	:");\
		p2.display();\
		\
		Product p3 = new Product("jagaur","cars12345", 5000000);\
		System.out.println("Displaying p3	:");\
		p3.display();\
		\
		Product p = p3.getPrice() < (p1.price < p2.price ? p1.price :p2.price)?p3:(p1.price<p2.price ? p1:p2);\
		System.out.println("lowest price is	:");\
		p.display();\
	\}\
\
\}}