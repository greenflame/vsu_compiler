; ----- Class info -----
.version 51 0
.source f.java
.class super public f
.super java/lang/Object

; ----- Fields for function vars -----
.field public q I
.field public n I

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
	putfield f parent LRoot;
	return
.end method

; ----- Run function -----
.method public run : (I)I
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	aload 0
	ldc 0
	putfield f q I
	aload 0
	iload 1
	putfield f n I
	; ----- Body -----
	aload 0
	getfield f parent LRoot;
	aload 0
	getfield f parent LRoot;
	getfield Root fcall I
	ldc 1
	iadd
	putfield Root fcall I
	aload 0
	ldc 0
	putfield f q I
	aload 0
	getfield f n I
	ldc 1
	if_icmpeq L2
	ldc 0
	goto L3
L2:
	ldc 1
L3:
	ldc 0
	if_icmpne L0
	goto L1
L0:
	ldc 1
	ireturn
L1:
	new sum
	dup
	aload 0
	invokespecial sum <init> (Lf;)V
	aload 0
	getfield f n I
	ldc 1
	isub
	invokevirtual sum run (I)I
	aload 0
	getfield f q I
	iadd
	ireturn
.end method

