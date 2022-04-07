{\rtf1\ansi\ansicpg1252\cocoartf1348\cocoasubrtf170
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red0\green0\blue192;\red106\green62\blue62;
\red42\green0\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww31500\viewh14380\viewkind0
\deftab720
\pard\pardeftab720

\f0\fs22 \cf2 package\cf0  product;\
\
\cf2 public\cf0  \cf2 class\cf0  Product \{\
	String \cf3 pname\cf0 ,\cf3 pcode\cf0 ;\
	\cf2 int\cf0  \cf3 price\cf0 ;\
	\cf2 public\cf0  Product() \{ \}\
	\cf2 public\cf0  Product(String \cf4 pname\cf0 , String \cf4 pcode\cf0 , \cf2 int\cf0  \cf4 price\cf0 )\{\
		\cf2 this\cf0 .\cf3 pname\cf0  = \cf4 pname\cf0 ;\
		\cf2 this\cf0 .\cf3 pcode\cf0  = \cf4 pcode\cf0 ;\
		\cf2 this\cf0 .\cf3 price\cf0  = \cf4 price\cf0 ;\
	\}\
	\
\cf2 public\cf0  \cf2 void\cf0  setPname(String \cf4 pname\cf0 )\{\
	\cf2 this\cf0 .\cf3 pname\cf0 =\cf4 pname\cf0 ;\
\}\
\cf2 public\cf0  \cf2 void\cf0  setPcode(String \cf4 pcode\cf0 )\{\
	\cf2 this\cf0 .\cf3 pcode\cf0 =\cf4 pcode\cf0 ;\
\}\
\cf2 public\cf0  \cf2 void\cf0  setPrice(\cf2 int\cf0  \cf4 price\cf0 )\{\
	\cf2 this\cf0 .\cf3 price\cf0 =\cf4 price\cf0 ;\
\}\
\
\
\cf2 public\cf0  String getPname(String \cf4 pname\cf0 )\{\
	\cf2 return\cf0  \cf4 pname\cf0 ;\
\}\
\cf2 public\cf0  String getPcode(String \cf4 pcode\cf0 )\{\
	\cf2 return\cf0  \cf4 pcode\cf0 ;\
\}\
\cf2 public\cf0  \cf2 int\cf0  getPrice(\cf2 int\cf0  \cf4 price\cf0 )\{\
	\cf2 return\cf0  \cf4 price\cf0 ;\
\}\
\
\cf2 public\cf0  \cf2 void\cf0  display()\{\
	System.\cf3 out\cf0 .println(\cf5 "pcode :"\cf0  + \cf2 this\cf0 .\cf3 pcode\cf0 );\
	System.\cf3 out\cf0 .println(\cf5 "pname :"\cf0  + \cf2 this\cf0 .\cf3 pname\cf0 );\
	System.\cf3 out\cf0 .println(\cf5 "price :"\cf0  + \cf2 this\cf0 .\cf3 price\cf0  + \cf5 "\\n"\cf0 );\
\}\
\
\
\}\
\
\
\
\
\cf2 package\cf0  product;\
\
\cf2 public\cf0  \cf2 class\cf0  cars\
\{\
\
	\cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  main(String[] \cf4 args\cf0 )\
	\{\
		Product \cf4 p1\cf0  = \cf2 new\cf0  Product();\
		\cf4 p1\cf0 .\cf3 pcode\cf0  = \cf5 "cars123"\cf0 ;\
		\cf4 p1\cf0 .\cf3 pname\cf0  = \cf5 "Benz"\cf0 ;\
		\cf4 p1\cf0 .\cf3 price\cf0  = 3500000;\
		System.\cf3 out\cf0 .println(\cf5 "Displaying p1 :"\cf0 );\
		\cf4 p1\cf0 .display();\
		\
		Product \cf4 p2\cf0  = \cf2 new\cf0  Product(\cf5 "cars435"\cf0 ,\cf5 "jaguar"\cf0 ,4500000);\
		System.\cf3 out\cf0 .println(\cf5 "Displaying p2 :"\cf0 );\
		\cf4 p2\cf0 .display();\
		\
		Product \cf4 p3\cf0  = \cf2 new\cf0  Product(\cf5 "cars345"\cf0 ,\cf5 "bmw"\cf0 ,5600000);\
		System.\cf3 out\cf0 .println(\cf5 "Displaying p3 :"\cf0 );\
		\cf4 p3\cf0 .display();\
		\
		Product \cf4 p\cf0  = \cf4 p3\cf0 .getPrice(\cf4 p3\cf0 .\cf3 price\cf0 )<(\cf4 p1\cf0 .\cf3 price\cf0 <\cf4 p2\cf0 .\cf3 price\cf0 ?\cf4 p1\cf0 .\cf3 price\cf0 :\cf4 p2\cf0 .\cf3 price\cf0 )?\cf4 p3\cf0 :(\cf4 p1\cf0 .\cf3 price\cf0 <\cf4 p2\cf0 .\cf3 price\cf0 ?\cf4 p1\cf0 :\cf4 p2\cf0 );\
		System.\cf3 out\cf0 .println(\cf5 "\\nDisplaying product with lowest price:"\cf0  );\
		\cf4 p\cf0 .display();\
	\}\
\
\}\uc0\u711 }