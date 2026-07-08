#!/usr/bin/env sh
set -e

if command -v gradle >/dev/null 2>&1; then
  exec gradle "$@"
fi

if [ -z "$JAVA_HOME" ]; then
  JAVA_HOME=$(dirname "$(dirname "$(readlink -f "$(command -v java)")")")
fi

APP_HOME=$(CDPATH= cd -- "$(dirname -- "$0")" && pwd)
CLASSPATH="$APP_HOME/gradle/wrapper/gradle-wrapper.jar"

if [ -f "$CLASSPATH" ]; then
  exec "$JAVA_HOME/bin/java" -classpath "$CLASSPATH" org.gradle.launcher.GradleMain "$@"
fi

echo "Gradle was not found on PATH and the wrapper jar is missing. Install Gradle or provide the wrapper jar." >&2
exit 1
