def merge_segment(input_list):
    if not input_list:
        return []
    
    output_list = []
    current_segment = input_list[0]
    
    for segment in input_list[1:]:
        if segment['SA'] == current_segment['SA'] and segment['start_time'] <= current['end_time']:
            current_segment['end_time'] = max(current_segment['end_time'], segment['end_time'])
            
        else:
            output_list.append(current_segment)
            current_segment = segment
            
    output_list.append(current_segment)
    
    return output_list
            
        