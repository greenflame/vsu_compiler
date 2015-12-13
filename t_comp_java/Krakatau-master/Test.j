.version 52 0
.source Main.java
.class super Test
.super java/lang/Object

.field public a I
.field public b I
.field public c I

.method  <init> : ()V
	; method code size: 20 bytes
	.limit stack 2
	.limit locals 1
	aload_0
	invokespecial java/lang/Object <init> ()V
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
	; method code size: 31 bytes
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
	getfield Test c I
	ireturn
.end method
