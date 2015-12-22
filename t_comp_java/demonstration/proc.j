; ----- Class info -----
.version 51 0
.source proc.java
.class super public proc
.super java/lang/Object

; ----- Fields for function vars -----
.field public m I

; ----- Reference to parent function call instance -----
.field public parent Lsum;

; ----- Constructor ------
.method  <init> : (Lsum;)V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
; ----- Copying first parameter to parent field -----
	aload_0
	aload_1
	putfield proc parent Lsum;
	return
.end method

; ----- Run function -----
.method public run : (I)V
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	aload 0
	iload 1
	putfield proc m I
	; ----- Body -----
	aload 0
	getfield proc parent Lsum;
	getfield sum parent Lf;
	aload 0
	getfield proc m I
	putfield f q I
	return
.end method

