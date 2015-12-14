; ----- Class info -----
.version 52 0
.source hidden.java
.class super public hidden
.super java/lang/Object

; ----- Fields for function vars -----

; ----- Reference to parent function call instance -----
.field public parent Lf1;

; ----- Constructor ------
.method  <init> : (Lf1;)V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
; ----- Copying first parameter to parent field -----
	aload_0
	aload_1
	putfield hidden parent Lf1;
	return
.end method

; ----- Main function -----
.method public run : ()V
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	; ----- Body -----
	getstatic java/lang/System out Ljava/io/PrintStream;
	ldc 1
	invokevirtual java/io/PrintStream println (I)V
	return
.end method

