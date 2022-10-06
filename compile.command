#! /bin/zsh
cd "${0:h}"
/System/Library/Java/JavaVirtualMachines/1.6.0.jdk/Contents/Home/bin/javac -d bin -cp clientlibs.jar -sourcepath src src/*.java