.version 52 0
.source Main.java
.class super Test
.super java/lang/Object

.field public a I
.field public b I
.field public c I

.method  <init> : ()V
	; method code size: 5 bytes
	.limit stack 1
	.limit locals 1
	aload_0
	invokespecial java/lang/Object <init> ()V
	return
.end method

.method  <init> : (III)V
	; method code size: 20 bytes
	.limit stack 2
	.limit locals 4
	aload_0
	invokespecial java/lang/Object <init> ()V
	aload_0
	iload_1
	putfield Test a I
	aload_0
	iload_2
	putfield Test b I
	aload_0
	iload_3
	putfield Test c I
	return
.end method

.method public run : ()I
	; method code size: 29 bytes
	.limit stack 3
	.limit locals 1
	aload_0
	iconst_4
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
	getfield Test c I
	ireturn
.end method
