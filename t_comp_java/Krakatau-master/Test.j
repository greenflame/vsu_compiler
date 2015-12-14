.version 52 0
.source Main.java
.class super Test
.super java/lang/Object

.field public a I
.field public b I
.field public c I
.field public parent LTest;

.method  <init> : (LTest;)V
	; method code size: 25 bytes
	.limit stack 2
	.limit locals 2
	aload_0
	invokespecial java/lang/Object <init> ()V
	aload_0
	aload_1
	putfield Test parent LTest;
	aload_0
	iconst_0
	putfield Test a I
	aload_0
	iconst_0
	putfield Test b I
	aload_0
	iconst_0
	putfield Test c I
	return
.end method

.method public run : (I)I
	; method code size: 70 bytes
	.limit stack 3
	.limit locals 3
	iconst_4
	istore_2
	aload_0
	iload_1
	putfield Test a I
	aload_0
	bipush 8
	putfield Test b I
	aload_0
	aload_0
	getfield Test a I
	aload_0
	getfield Test b I
	iadd
	putfield Test c I
	aload_0
	aload_0
	getfield Test a I
	aload_0
	getfield Test b I
	isub
	putfield Test c I
	aload_0
	aload_0
	getfield Test a I
	aload_0
	getfield Test b I
	imul
	putfield Test c I
	aload_0
	aload_0
	getfield Test a I
	aload_0
	getfield Test b I
	idiv
	putfield Test c I
	aload_0
	getfield Test c I
	ireturn
.end method
