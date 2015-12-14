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
	; method code size: 12 bytes
	.limit stack 2
	.limit locals 1
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 'Hello, world!'
	invokevirtual java/io/PrintStream println (Ljava/lang/String;)V
	invokestatic Main t ()V
	return
.end method

.method static public t : ()V
	; method code size: 17 bytes
	.limit stack 3
	.limit locals 1
	new Test
	dup
	aconst_null
	invokespecial Test <init> (LTest;)V
	astore_0
	aload_0
	bipush 12
	invokevirtual Test run (I)I
	pop
	return
.end method
