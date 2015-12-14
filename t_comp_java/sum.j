; ----- Class info -----
.version 52 0
.source sum.java
.class super public sum
.super java/lang/Object

; ----- Fields for function vars -----
.field public a I
.field public b I

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
	putfield sum parent LRoot;
	return
.end method

; ----- Main function -----
.method public run : (II)I
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	aload 0
	iload 1
	putfield sum a I
	aload 0
	iload 2
	putfield sum b I
	; ----- Body -----
	aload 0
	getfield sum a I
	aload 0
	getfield sum b I
	iadd
	ireturn
.end method

