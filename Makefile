SBT=sbt/bin/sbt

.PHONY: sbt

sbt:
	$(SBT)

bench:
	$(SBT) bench:test
