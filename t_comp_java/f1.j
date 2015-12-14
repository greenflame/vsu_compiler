; ----- Class info -----
.version 52 0
.source f1.java
.class super public f1
.super java/lang/Object

; ----- Fields for function vars -----
.field public f I
.field public g I

; ----- Reference to parent function call instance -----
.field public parent LRoot;

; ----- Constructor ------
.method  <init> : (LRoot;)V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
; ----- Copying first parameter to parent field -----
	aload_0
	aload_1
	putfield f1 parent LRoot;
	return
.end method

; ----- Main function -----
.method public run : (II)V
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	aload 0
	iload 2
	putfield f1 f I
	aload 0
	iload 1
	putfield f1 g I
	; ----- Body -----
	new hidden
	dup
	aload 0
	invokespecial hidden <init> (Lf1;)V
	invokevirtual hidden run ()V
	getstatic java/lang/System out Ljava/io/PrintStream;
	aload 0
	getfield f1 g I
	aload 0
	getfield f1 f I
	iadd
	invokevirtual java/io/PrintStream println (I)V
	return
.end method

