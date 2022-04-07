{\rtf1\ansi\ansicpg1252\cocoartf1348\cocoasubrtf170
{\fonttbl\f0\fnil\fcharset0 Monaco;}
{\colortbl;\red255\green255\blue255;\red127\green0\blue85;\red106\green62\blue62;\red0\green0\blue192;
\red42\green0\blue255;}
\paperw11900\paperh16840\margl1440\margr1440\vieww10800\viewh8400\viewkind0
\deftab720
\pard\pardeftab720

\f0\fs22 \cf2 import\cf0  java.util.Scanner;\
\
\
\cf2 public\cf0  \cf2 class\cf0  Addition \{\
	\
\
	\cf2 public\cf0  \cf2 static\cf0  \cf2 void\cf0  main(String[] \cf3 args\cf0 ) \{\
		\cf2 int\cf0  \cf3 p\cf0 ,\cf3 q\cf0 ,\cf3 m\cf0 ,\cf3 n\cf0 ;\
		Scanner \cf3 s\cf0 =\cf2 new\cf0  Scanner(System.\cf4 in\cf0 );\
		System.\cf4 out\cf0 .print(\cf5 "Enter matrix A row number : "\cf0 );\
		\cf3 p\cf0 =\cf3 s\cf0 .nextInt();\
		System.\cf4 out\cf0 .print(\cf5 "Enter matrix A column number : "\cf0 );\
		\cf3 q\cf0 =\cf3 s\cf0 .nextInt();\
		System.\cf4 out\cf0 .print(\cf5 "Enter matrix B row number : "\cf0 );\
		\cf3 m\cf0 =\cf3 s\cf0 .nextInt();\
		System.\cf4 out\cf0 .print(\cf5 "Enter matrix B column number : "\cf0 );\
		\cf3 n\cf0 =\cf3 s\cf0 .nextInt();\
		\
		\cf2 if\cf0  (\cf3 p\cf0 ==\cf3 m\cf0  && \cf3 q\cf0  == \cf3 n\cf0 )\{\
			\
			\cf2 int\cf0  \cf3 a\cf0 [][] =\cf2 new\cf0  \cf2 int\cf0 [\cf3 p\cf0 ][\cf3 q\cf0 ];\
			\cf2 int\cf0  \cf3 b\cf0 [][]=\cf2 new\cf0  \cf2 int\cf0 [\cf3 m\cf0 ][\cf3 n\cf0 ];\
			\
			System.\cf4 out\cf0 .println(\cf5 "enter elements of matrix A"\cf0 );\
			\cf2 for\cf0 (\cf2 int\cf0  \cf3 i\cf0 =0;\cf3 i\cf0 <\cf3 p\cf0 ;\cf3 i\cf0 ++)\
				\cf2 for\cf0 (\cf2 int\cf0  \cf3 j\cf0 =0;\cf3 j\cf0 <\cf3 q\cf0 ;\cf3 j\cf0 ++)\
					\cf3 a\cf0 [\cf3 i\cf0 ][\cf3 j\cf0 ]=\cf3 s\cf0 .nextInt();\
			System.\cf4 out\cf0 .println(\cf5 "enter elements of matrix B"\cf0 );\
			\cf2 for\cf0 (\cf2 int\cf0  \cf3 i\cf0 =0;\cf3 i\cf0 <\cf3 m\cf0 ;\cf3 i\cf0 ++)\
				\cf2 for\cf0 (\cf2 int\cf0  \cf3 j\cf0 =0;\cf3 j\cf0 <\cf3 n\cf0 ;\cf3 j\cf0 ++)\
					\cf3 b\cf0 [\cf3 i\cf0 ][\cf3 j\cf0 ]=\cf3 s\cf0 .nextInt();\
			\
			System.\cf4 out\cf0 .println(\cf5 " matrix A"\cf0 );\
			\cf2 for\cf0 (\cf2 int\cf0  \cf3 i\cf0 =0;\cf3 i\cf0 <\cf3 p\cf0 ;\cf3 i\cf0 ++)\
				\cf2 for\cf0 (\cf2 int\cf0  \cf3 j\cf0 =0;\cf3 j\cf0 <\cf3 q\cf0 ;\cf3 j\cf0 ++)\
					System.\cf4 out\cf0 .println(\cf3 a\cf0 [\cf3 i\cf0 ][\cf3 j\cf0 ]+ \cf5 " "\cf0 );\
			System.\cf4 out\cf0 .println();\
			\
			System.\cf4 out\cf0 .println(\cf5 " matrix B"\cf0 );\
			\cf2 for\cf0 (\cf2 int\cf0  \cf3 i\cf0 =0;\cf3 i\cf0 <\cf3 m\cf0 ;\cf3 i\cf0 ++)\
				\cf2 for\cf0 (\cf2 int\cf0  \cf3 j\cf0 =0;\cf3 j\cf0 <\cf3 n\cf0 ;\cf3 j\cf0 ++)\
					System.\cf4 out\cf0 .println(\cf3 b\cf0 [\cf3 i\cf0 ][\cf3 j\cf0 ]+ \cf5 " "\cf0 );\
			System.\cf4 out\cf0 .println();\
			\
			System.\cf4 out\cf0 .println(\cf5 " Sum matrix: "\cf0 );\
			\cf2 for\cf0 (\cf2 int\cf0  \cf3 i\cf0 =0;\cf3 i\cf0 <\cf3 m\cf0 ;\cf3 i\cf0 ++)\
				\cf2 for\cf0 (\cf2 int\cf0  \cf3 j\cf0 =0;\cf3 j\cf0 <\cf3 n\cf0 ;\cf3 j\cf0 ++)\
					System.\cf4 out\cf0 .println(\cf3 a\cf0 [\cf3 i\cf0 ][\cf3 j\cf0 ]+\cf3 b\cf0 [\cf3 i\cf0 ][\cf3 j\cf0 ]+ \cf5 " "\cf0 );\
			System.\cf4 out\cf0 .println();\
			\
		\}\
		\cf2 else\cf0 \{\
			System.\cf4 out\cf0 .println(\cf5 "These matrices cannot be added"\cf0 );\
		\}\
		\
		\
	\}\
\
\}\
\
}