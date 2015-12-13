; ----- Class info -----
.version 52 0
.source Root.java
.class super public Root
.super java/lang/Object

; ----- Fields for function vars-----
.field public a I
.field public b I
.field public c I

; ----- Constructor ------
.method  <init> : ()V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
	return
.end method

; ----- Main function -----
.method public run : ()V
	; ----- Initializing fields. Locals with 0, args with input values. -----
	aload 0
	ldc 0
	putfield Root a I
	aload 0
	ldc 0
	putfield Root b I
	aload 0
	ldc 0
	putfield Root c I
	; ----- Body -----
	aload 0
	ldc 76
	putfield Test a I
	return
.end method
