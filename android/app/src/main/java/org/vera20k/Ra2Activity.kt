package org.vera20k

/**
 * The second launcher entry: the same engine, started in original Red Alert 2
 * mode.
 *
 * It is a class of its own rather than an `activity-alias`, because only an
 * activity can carry its own `android:process`, and the two entries must not
 * share one: the engine builds a single winit event loop per process, and
 * `android_main` ends a process that tries a second. Everything else is
 * inherited: the folder picker, the LAN network binding and the launcher icon
 * switch all live on [VeraActivity]. Rust tells the entries apart by this
 * class's name (`android/src/lib.rs`) and turns `ra2_launch` on for it.
 */
class Ra2Activity : VeraActivity()
