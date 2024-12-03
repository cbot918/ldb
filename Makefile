ENTRY=Main

run: $(ENTRY).class
	java -cp .:mysql-connector-java-9.0.0.jar Main
	rm $(ENTRY).class
$(ENTRY).class: $(ENTRY).java
	javac -cp .:mysql-connector-java-9.0.0.jar $(ENTRY).java


.PHONY: run build

.SILENT: run build