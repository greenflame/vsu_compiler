; ----- Class info -----
.version 52 0
.source incq.java
.class super public incq
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
	putfield incq parent LRoot;
	return
.end method

; ----- Main function -----
.method public run : ()V
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	; ----- Body -----
	aload 0
	getfield incq parent LRoot;
	aload 0
	getfield incq parent LRoot;
	getfield Root q I
	ldc 1
	iadd
	putfield Root q I
	return
.end method

