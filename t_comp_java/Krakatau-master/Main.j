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
	; method code size: 82 bytes
	.limit stack 2
	.limit locals 7
	sipush 3534
	istore_1
	iconst_0
	istore_2
	ldc 2.450000047683716F
	fstore_3
	ldc 123456
	istore 4
	iconst_0
	istore 5
L16:
.stack full
	locals Object [Ljava/lang/String; Integer Integer Float Integer Integer
	stack 
.end stack
	iload 5
	bipush 10
	if_icmpge L39
	iconst_1
	istore 6
	iload 4
	iload 6
	iadd
	istore 4
	iinc 5 1
	goto L16
L39:
.stack chop 1
	iconst_0
	istore 5
L42:
.stack append
	locals Integer
.end stack
	iload 5
	bipush 10
	if_icmpge L65
	iconst_1
	istore 6
	iload 4
	iload 6
	iadd
	istore 4
	iinc 5 1
	goto L42
L65:
.stack chop 1
	getstatic java/lang/System out Ljava/io/PrintStream;
	iload 4
	invokevirtual java/io/PrintStream println (I)V
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Hello, world!'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
	return
.end method
