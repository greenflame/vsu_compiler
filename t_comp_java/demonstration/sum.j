; ----- Class info -----
.version 51 0
.source sum.java
.class super public sum
.super java/lang/Object

; ----- Fields for function vars -----
.field public res I
.field public res2 I
.field public i I
.field public n I
.field public nnn I

; ----- Reference to parent function call instance -----
.field public parent Lf;

; ----- Constructor ------
.method  <init> : (Lf;)V
	; ----- Call super constructor -----
	aload 0
	invokespecial java/lang/Object <init> ()V
; ----- Copying first parameter to parent field -----
	aload_0
	aload_1
	putfield sum parent Lf;
	return
.end method

; ----- Run function -----
.method public run : (I)I
	.limit stack 10
	.limit locals 10
	; ----- Initializing fields. Locals with 0, args with input values. -----
	aload 0
	ldc 0
	putfield sum res I
	aload 0
	ldc 0
	putfield sum res2 I
	aload 0
	ldc 0
	putfield sum i I
	aload 0
	iload 1
	putfield sum n I
	aload 0
	ldc 0
	putfield sum nnn I
	; ----- Body -----
	aload 0
	getfield sum parent Lf;
	getfield f parent LRoot;
	aload 0
	getfield sum parent Lf;
	getfield f parent LRoot;
	getfield Root summcall I
	ldc 1
	iadd
	putfield Root summcall I
	aload 0
	ldc 0
	putfield sum res I
	aload 0
	getfield sum parent Lf;
	getfield f parent LRoot;
	new f
	dup
	aload 0
	getfield sum parent Lf;
	getfield f parent LRoot;
	invokespecial f <init> (LRoot;)V
	aload 0
	getfield sum n I
	invokevirtual f run (I)I
	putfield Root nn I
	aload 0
	ldc 1
	putfield sum i I
L4:
	aload 0
	getfield sum i I
	aload 0
	getfield sum parent Lf;
	getfield f parent LRoot;
	getfield Root nn I
	if_icmple L6
	ldc 0
	goto L7
L6:
	ldc 1
L7:
	ldc 0
	if_icmpeq L5
	aload 0
	aload 0
	getfield sum res I
	aload 0
	getfield sum i I
	iadd
	putfield sum res I
	new proc
	dup
	aload 0
	invokespecial proc <init> (Lsum;)V
	aload 0
	getfield sum parent Lf;
	getfield f q I
	ldc 1
	iadd
	invokevirtual proc run (I)V
	aload 0
	aload 0
	getfield sum i I
	ldc 1
	iadd
	putfield sum i I
	goto L4
L5:
	aload 0
	ldc 0
	putfield sum res2 I
	aload 0
	new f
	dup
	aload 0
	getfield sum parent Lf;
	getfield f parent LRoot;
	invokespecial f <init> (LRoot;)V
	aload 0
	getfield sum n I
	invokevirtual f run (I)I
	putfield sum nnn I
	aload 0
	ldc 1
	putfield sum i I
L8:
	aload 0
	getfield sum i I
	aload 0
	getfield sum nnn I
	if_icmple L10
	ldc 0
	goto L11
L10:
	ldc 1
L11:
	ldc 0
	if_icmpeq L9
	aload 0
	aload 0
	getfield sum res2 I
	aload 0
	getfield sum i I
	iadd
	putfield sum res2 I
	new proc
	dup
	aload 0
	invokespecial proc <init> (Lsum;)V
	aload 0
	getfield sum parent Lf;
	getfield f q I
	ldc 1
	iadd
	invokevirtual proc run (I)V
	aload 0
	aload 0
	getfield sum i I
	ldc 1
	iadd
	putfield sum i I
	goto L8
L9:
	aload 0
	getfield sum res I
	aload 0
	getfield sum res2 I
	iadd
	ireturn
.end method

