package org.example.dummykobweblibraryforjitpack

@JsModule("is-sorted")
@JsNonModule
external fun <T> sorted(a: Array<T>): Boolean
