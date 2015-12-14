; ----- Class info -----
.version 52 0
.source f4.java
.class super public f4
.super java/lang/Object

; ----- Fields for function vars -----

; ----- Reference to parent function call instance -----
.field public parent Lf3;

; ----- Constructor ------
.method  <init> : (Lf3;)V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
; ----- Copying first parameter to parent field -----
	aload_0
	aload_1
	putfield f4 parent Lf3;
	return
.end method

; ----- Main function -----
.method public run : ()V
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	; ----- Body -----
	new f1
	dup
	aload 0
	getfield f4 parent Lf3;
	getfield f3 parent Lf2;
	getfield f2 parent LRoot;
	invokespecial f1 <init> (LRoot;)V
	ldc 3
	ldc 4
	invokevirtual f1 run (II)V
	return
.end method
