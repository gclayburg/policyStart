#!/usr/bin/env bash
RUNDIR="$( cd "$( dirname "${BASH_SOURCE[0]:-$$}" )" && pwd )"
cd $RUNDIR
java -Xmx1024m -XX:TieredStopAtLevel=1 -noverify -jar synconsole-0.7.3-SNAPSHOT.war