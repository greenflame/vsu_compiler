; ----- Class info -----
.version 52 0
.source f3.java
.class super public f3
.super java/lang/Object

; ----- Fields for function vars -----

; ----- Reference to parent function call instance -----
.field public parent Lf2;

; ----- Constructor ------
.method  <init> : (Lf2;)V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
; ----- Copying first parameter to parent field -----
	aload_0
	aload_1
	putfield f3 parent Lf2;
	return
.end method

; ----- Main function -----
.method public run : ()V
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	; ----- Body -----
	new f4
	dup
	aload 0
	invokespecial f4 <init> (Lf3;)V
	invokevirtual f4 run ()V
	return
.end method
