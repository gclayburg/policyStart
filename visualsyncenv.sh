#!/usr/bin/env bash
export POLICY_GROOVY_HOME=src/main/groovy
export POLICY_ENABLEDSL="true"
export POLICY_FORCE_RECOMPILE_ENTRY_POINTS="false"
export POLICY_FORCE_RELOAD_POLICY_ENGINE="false"

export SPRING_DATA_MONGODB_URI="mongodb://localhost:27017/synconsolegitpod"
export SYNC_BASEURL="self"
#export POLICY_FRAGMENTS_EMAILMAN__HOST="localhost"
#export POLICY_FRAGMENTS_EMAILMAN__PORT=8092
#export POLICY_FRAGMENTS_EMAILMAN__URI="/api/v2"
export SPRING_PROFILES_ACTIVE="prod,mongolocal"
echo "setting POLICY HOME to $POLICY_GROOVY_HOME"
