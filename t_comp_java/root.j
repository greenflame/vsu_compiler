; ----- Class info -----
.version 52 0
.source Root.java
.class super public Root
.super java/lang/Object

; ----- Fields for function vars -----
.field public q I

; ----- Constructor ------
.method  <init> : ()V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
	return
.end method

; ----- Main function -----
.method public run : ()V
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	aload 0
	ldc 0
	putfield Root q I
	; ----- Body -----
	aload 0
	new sum
	dup
	aload 0
	invokespecial sum <init> (LRoot;)V
	ldc 4
	ldc 6
	invokevirtual sum run (II)I
	putfield Root q I
	new incq
	dup
	aload 0
	invokespecial incq <init> (LRoot;)V
	invokevirtual incq run ()V
	getstatic java/lang/System out Ljava/io/PrintStream;
	aload 0
	getfield Root q I
	invokevirtual java/io/PrintStream println (I)V
	return
.end method

.method static public main : ([Ljava/lang/String;)V
	; method code size: 13 bytes
	.limit stack 2
	.limit locals 2
	new Root
	dup
	invokespecial Root <init> ()V
	invokevirtual Root run ()V
	return
.end method

