; ----- Class info -----
.version 52 0
.source f2.java
.class super public f2
.super java/lang/Object

; ----- Fields for function vars -----

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
	putfield f2 parent LRoot;
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
	getfield f2 parent LRoot;
	invokespecial f1 <init> (LRoot;)V
	ldc 5
	ldc 6
	invokevirtual f1 run (II)V
	return
.end method

