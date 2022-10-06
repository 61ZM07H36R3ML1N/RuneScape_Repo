@echo off
title World 1
java -XX:-OmitStackTraceInFastThrow -XX:+AggressiveHeap -cp bin;data/libs/*; com.rs.ServerLauncher true true false 43594 1
pause