.version 52 0
.source Main.java
.class super public Main
.super java/lang/Object


.method public <init> : ()V
	; method code size: 5 bytes
	.limit stack 1
	.limit locals 1
	aload_0
	invokespecial java/lang/Object <init> ()V
	return
.end method

.method static public main : ([Ljava/lang/String;)V
	; method code size: 13 bytes
	.limit stack 2
	.limit locals 2
	new Root
	dup
	invokespecial Root <init> ()V
	astore_1
	aload_1
	invokevirtual Root run ()V
	return
.end method
