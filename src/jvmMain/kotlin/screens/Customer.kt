package screens

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import compose.LabelTextField
import model.Contact

@Composable
@Preview
fun Customer(){
    val map= mutableListOf<Contact>(
        Contact(1,"Fahad","03233344445"),
        Contact(2,"Bilal","03423123333")
    )
    var contactName by remember {
        mutableStateOf("")
    }
    var contactNo by remember {
        mutableStateOf("")
    }
    var addUpdate by remember {
        mutableStateOf("Add")
    }
    Column (modifier = Modifier.fillMaxSize().padding(start = 10.dp, top = 20.dp)){
        Row{
            LabelTextField("Customer Name: " ,contactName,KeyboardType.Text){
                    contactName=it
            }
            Spacer(Modifier.width(20.dp))
            LabelTextField("Contact No: ",contactNo, KeyboardType.Number){
                contactNo=it
            }
            Spacer(Modifier.width(20.dp))
            Button(onClick = {
                             map.forEachIndexed { index, contact ->{
                                 if(contact.contactName==contactName && contact.contactNo==contactNo){
                                     map[index]=Contact(contact.id,contactName,contactNo)
                                 }
                                }
                             }
            }, modifier = Modifier.align(alignment = Alignment.Bottom)){
                Text("$addUpdate")
            }
        }
        Spacer(Modifier.height(50.dp))
        LazyColumn {
            item{
                Row (modifier = Modifier.fillMaxWidth(1f).background(Color.LightGray).padding(bottom = 20.dp)){
                    Text("Contact Name",Modifier.fillMaxWidth(0.5f))
                    Text("Contact Number",Modifier.fillMaxWidth(0.5f))
                    Text("Actions",Modifier.align(Alignment.CenterVertically))

                }
            }
            items(map){contact->
                
                Row (modifier = Modifier.fillMaxWidth(1f)){
                    Text(contact.contactName,Modifier.fillMaxWidth(0.5f))
                    Text(contact.contactNo,Modifier.fillMaxWidth(0.5f))
                    Icon(Icons.Filled.Edit,"Edit", modifier = Modifier.clickable {
                        contactName=contact.contactName
                        contactNo=contact.contactNo
                        addUpdate="Update"
                    })
                }

            }
        }
    }
}
