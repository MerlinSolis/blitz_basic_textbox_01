


; setting up the string array
rows = 3 
Dim message_list$(rows - 1) ; three elements, starting from 0

; the string array storing each line
message_list$(0) = "Edea? Cid stepped out of the house, "
message_list$(1) = "The fussy toddler in his arms having "
message_list$(2) = "finally fallen asleep after what felt "


; timer variables
Text_update_interval = 120
text_update_time = MilliSecs()

For row_count = 0 To rows -1
	string_count = 1
	
	While string_count <= Len(message_list$(row_count)) ; loop condition is False when the last character per line is reached
		
		current_time = MilliSecs()
		; stepping through each character in the string once the set amount of time per character has passed
		If current_time - text_update_time > text_update_interval Then
			Write Mid$(message_list$(row_count), string_count, 1)
			text_update_time = MilliSecs()
			string_count = string_count + 1
		EndIf
	Wend
	Print
Next

; wait for keypress and end the program
WaitKey
End
;~IDEal Editor Parameters:
;~C#Blitz3D