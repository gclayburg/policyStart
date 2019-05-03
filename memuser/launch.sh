#!/usr/bin/env bash
RUNDIR="$( cd "$( dirname "${BASH_SOURCE[0]:-$$}" )" && pwd )"
cd $RUNDIR
java -Xmx512m -XX:TieredStopAtLevel=1 -noverify -jar memuser-0.6.5.jar
