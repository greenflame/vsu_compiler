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
	; method code size: 22 bytes
	.limit stack 4
	.limit locals 2
	new f1
	dup
	invokespecial f1 <init> ()V
	astore_1
	getstatic java/lang/System out Ljava/io/PrintStream;
	aload_1
	iconst_1
	bipush 56
	invokevirtual f1 run (II)I
	invokevirtual java/io/PrintStream println (I)V
	return
.end method
