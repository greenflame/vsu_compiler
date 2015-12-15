.version 52 0
.source Main.java
.class super public Main
.super java/lang/Object


.method public <init> : ()V
	; method code size: 5 bytes
	.limit stack 1
	.limit locals 1
	aload_0
	invokespecial java/lang/Object <init> ()V
	return
.end method

.method static public main : ([Ljava/lang/String;)V
	; method code size: 43 bytes
	.limit stack 2
	.limit locals 5
	iconst_2
	istore_1
	iconst_3
	istore_2
	bipush 8
	istore_3
	iload_1
	iload_2
	if_icmpeq L23
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Hello!'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
	goto L34
L23:
.stack append
	locals Integer Integer Integer
.end stack
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Goodby!'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
	iconst_4
	istore 4
L34:
.stack same
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Later!'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
	return
.end method
